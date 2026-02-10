package com.hhy.demo4test;

import java.util.*;

public class Room {
    //1.准备好54张拍；定义集合容器54张牌
    private  List<Card> cardlist=new ArrayList<>();
    //2.初始化54张牌进去
    {
        //3.准备点数  (大小排序)
        String []nums={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.准备花色
        String []colors={"❤","♦","♣","♠"};
        int count=0;
        //5.组合点数和花色成为牌对象，加入到集合中里面
        for(String num:nums){
            count++;
            for(String color:colors){
                //创建不同的牌对象 为牌对象加入数值大小，方便排序
                Card card=new Card(num,color,count);
                //将不同的牌对象加入到集合
                cardlist.add(card);
            }
        }
//        Card card=new Card("","大王");
//        Card card2=new Card("","小王");
        Collections.addAll(cardlist,new Card("","小王",++count),new Card("","大王",++count));
        System.out.println(cardlist);

    }
    public void start() {
        //开始洗牌
        Collections.shuffle(cardlist);
        //打印洗好的牌张
        System.out.println(cardlist);
        //发牌
        //定义三个玩家：A=[] B=[] C=[]
        //嵌套
        Map<String ,List<Card>> map=new HashMap<>();
        List<Card> A=new ArrayList<>();
        List<Card> B=new ArrayList<>();
        List<Card> C=new ArrayList<>();
        map.put("A",A);
        map.put("B",B);
        map.put("C",C);
        //发牌 只发出去51张 3张作为底牌
        //[J ❤, 5 ♠, 10 ♦, K ♠, 4 ♠, 6 ♠, 2 ♦, K ❤, 9 ❤
        //   0   1     2     0    1     2
        for (int i = 0; i < cardlist.size()-3; i++) {
            //获取到当前的牌
            Card card=cardlist.get(i);
            //判断当前的这张牌发给谁 A0  B1  C2
            if(i%3==0){
                A.add(cardlist.get(i));
            }else if(i%3==1){
                B.add(cardlist.get(i));
            }else{
                C.add(cardlist.get(i));
            }
        }


        //拿最后的三张底牌
//        cardlist.get(51);
//        cardlist.get(52);
//        cardlist.get(53);
        List<Card> cardLast = cardlist.subList(cardlist.size() - 3, cardlist.size());
        System.out.println("底牌是:"+cardLast);
        //抢地主：直接把cardLast集合添加到玩家的集合中
        A.addAll(cardLast);
        //排序 对牌数进行排序
        sortCards(A);
        sortCards(B);
        sortCards(C);
        //看牌 对map集合进行遍历
        for(Map.Entry<String,List<Card>> entry:map.entrySet()){
            //获取到玩家的名称
            String name = entry.getKey();
            //获取到牌
            List<Card> value = entry.getValue();
            System.out.println(name+" "+value);
        }
    }

    private void sortCards(List<Card> cards) {
        //排序
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum()-o1.getNum();
            }
        });
    }
}
