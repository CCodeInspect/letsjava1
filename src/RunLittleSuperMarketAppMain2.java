import person.Customer;
import supermarket.LittleSuperMaket;
import supermarket.LittleSuperMaket.*;
import supermarket.Merchandise;

import javax.swing.*;
import java.util.Scanner;

public class RunLittleSuperMarketAppMain2 {
    public static void main(String[] args) {
        LittleSuperMaket littleSuperMaket = new LittleSuperMaket();
        littleSuperMaket.address = "世纪大道666号";
        littleSuperMaket.superMarketName = "nb超市";
        littleSuperMaket.parkingCount = 200;
        littleSuperMaket.merchandises = new Merchandise[200];
        littleSuperMaket.MerchandiseSold = new int[littleSuperMaket.merchandises.length];

        Merchandise[] all = littleSuperMaket.merchandises;
        for (int i = 0; i < all.length; i++) {
            all[i] = new Merchandise();
            all[i].count = 200;
            all[i].id = "id" + i;
            all[i].name = "商品" + i;
            all[i].purchasePrice = Math.random() * 200;
            all[i].soldPrice = (1 + Math.random()) / 200;

        }
        ;
        System.out.println("超市开门了");
        Scanner scanner = new Scanner(System.in);

        boolean open = true;
        while (open) {
            System.out.println("本店叫做" + littleSuperMaket.superMarketName);
            System.out.println("地址在" + littleSuperMaket.address);
            System.out.println("共有停车位" + littleSuperMaket.parkingCount);
            System.out.println("今天的营业额为" + littleSuperMaket.incomingSum);
            System.out.println("共有商品" + littleSuperMaket.merchandises.length);
            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int) (Math.random() * 1000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMaket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "光临！" + "您的停车位编号为" + littleSuperMaket.parkingCount);
                    littleSuperMaket.parkingCount--;
                } else {
                    System.out.println("不好意思，本店没有车位了，欢迎下次光临");
                    continue;
                }
                ;
            }
            ;
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供：" + all.length + "种商品，欢迎选购。请输入商品编号：");
                int index = scanner.nextInt();
                if (index < 0) {
                    break;
                }
                ;
                ;

                Merchandise m = all[index];
                System.out.println("您选购的商品" + m.name + "单价是" + m.soldPrice + "请问您要购买多少个？");
                int numberToBuy = scanner.nextInt();
                totalCost += numberToBuy * m.soldPrice;
                m.count -= numberToBuy;
                littleSuperMaket.MerchandiseSold[index] += numberToBuy;

                customer.money -= totalCost;

                if (customer.isDrivingCar) {
                    littleSuperMaket.parkingCount = littleSuperMaket.parkingCount++;

                }
                ;
                System.out.println("顾客" + customer.name + "共消费了" + totalCost);
                littleSuperMaket.incomingSum = totalCost;

                System.out.println("今天还营业吗？");
                open = scanner.nextBoolean();
            }
            ;
            System.out.println("超市关门了～,今天的营业额是" + littleSuperMaket.incomingSum + "今天总共卖了");
            for (int i = 0; i < littleSuperMaket.MerchandiseSold.length; i++) {
                Merchandise m = all[i];
                int numsold = littleSuperMaket.MerchandiseSold[i];
                if (numsold > 0) {
                    double inComming = m.soldPrice * numsold;
                    double netComming = m.soldPrice - m.purchasePrice * numsold;
                    System.out.println(m.name + "售出了" + numsold + "个" + "销售额为" + inComming + "净利润为：" + netComming);
                }
            }
            ;
            ;


        }
        ;


    }
}
