package net.sejuku;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 
 
public class BlackjackClass {
    public static void main(String[] args) {
        System.out.println("ゲームを開始します");

         //空の山札を作成
         List <Integer> deck = new ArrayList<>(52);
         //山札をシャッフル
         shuffleDeck(deck);


         List <Integer> player = new AllayList<>();
         List <Integer> player = new AllayList<>(); 

         player.add(deck.get(0));
         player.add(deck.get(1));
         player.add(deck.get(2));
         player.add(deck.get(3));

         int deckCount = 4;

         int playerhands = 2;

         System.out.println("あなたの1枚目のカードは" + toDescription(player.get(0)));
 
         System.out.println("ディーラーの1枚目のカードは" + toDescription(dealer.get(0)));
 
         System.out.println("あなたの2枚めのカードは" + toDescription(player.get(1)));
 
         System.out.println("ディーラーの2枚めのカードは秘密です。");

         int playerPoint = sumPoint(player);
         int dealerPoint = sumPoint(player);

         System.out.println("あなたの現在のポイントは" + playerPoint + "です。" );




 