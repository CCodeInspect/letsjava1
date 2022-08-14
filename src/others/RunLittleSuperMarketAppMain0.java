package others;

import supermarket.LittleSuperMarket;
import supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSuperMarketAppMain0 {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMaket = new LittleSuperMarket();
        littleSuperMaket.address = "世纪大道666号";
        littleSuperMaket.superMarketName = "nb超市";
        littleSuperMaket.parkingCount = 200;
        littleSuperMaket.merchandises = new Merchandise[200];
        littleSuperMaket.MerchandiseSold = new int[littleSuperMaket.merchandises.length];

        //商品数组引用
        Merchandise[] all = littleSuperMaket.merchandises;
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();

            m.count = 200;
            m.id = "id" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;

            all[i] = m;

        }
        ;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("第二件半价");
            int index = scanner.nextInt();
            if (index < 0) {
                break;
            }
            if (index >= all.length) {
                System.out.println("商品索引越界");
                continue;
            }
            ;
            Merchandise mm = all[index];

            System.out.println("商品" + mm.name + "售价为" + mm.soldPrice + "请问购买几个？");
            int numToBuy = scanner.nextInt();
            if (numToBuy > mm.count) {
                System.out.println("库存不足");
            }
            ;
            int fullPriceCount = numToBuy / 2 + numToBuy % 2;
            int halfPriceCount = numToBuy - fullPriceCount;
            double totalCost = fullPriceCount * mm.soldPrice + (halfPriceCount * mm.soldPrice / 2);
            mm.count -= numToBuy;
            System.out.println("选购的商品总价为" + totalCost);

        }

    }
}
