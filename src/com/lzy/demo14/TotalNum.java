package com.lzy.demo14;

public class TotalNum {
    public static void main(String[] args) {
//        for(int i = 0 ; i<=9 ;i++)
//        {
//            for(int j = 0 ; j<=12 ; j++)
//            {
//                for(int k = 0 ; k<=36 ;k++)
//                if(i*4+j*3+k*0.5==36&&(i+j+k==36))
//                {
//                    System.out.println("i-->"+i+" " +"j-->"+j+" other-->"+(k));
//                }
//            }
//        }
//
//    }
        for (int man = 0; man <= 9; man++) {
            for (int woman = 0; woman <= 12; woman++) {
                if (4 * man + 3 * woman + (36 - man - woman) / 2 == 36) {
                    System.out.println("男人有：" + man + ",女人有：" + woman + ",小孩有：" + (36 - man - woman));
                }
            }
        }
    }
}
