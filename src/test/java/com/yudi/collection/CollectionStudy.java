package com.yudi.collection;

import org.junit.Test;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */
public class CollectionStudy {
    public int [] geta(){

        return new int[]{1,2};
    }

    @Test
    public void test1(){
        int a = 123;
        ListNode ll = new ListNode(2);
        ListNode lll = new ListNode(4);
        ListNode llll = new ListNode(3);
        ll.next  = lll;
        lll.next = llll;

        ListNode aa = new ListNode(5);
        ListNode aaa = new ListNode(6);
        ListNode aaaa = new ListNode(4);
        aa.next  = aaa;
        aaa.next = aaaa;

        addTwoNumbers(ll,aa);

    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        int l1Real = 0;
        while(l1!=null){
            l1.val = l1.val * (int)Math.pow(10,count);
            l1Real+=l1.val;
            count++;
            l1= l1.next;
        }

        int count2 = 0;
        int l2Real = 0;
        while(l2!=null){
            l2.val = l2.val * (int)Math.pow(10,count2);
            l2Real+=l2.val;
            count2++;
            l2 = l2.next;
        }
        int l3Real = l1Real +l2Real;
        int rs = 0;
        int countR = 1;
        ListNode head = new ListNode(0);
        ListNode l3 = new ListNode(0);
        while (l3Real > 0) {

            rs = l3Real % 10;
            if (countR == 1){
                l3 = new ListNode(rs);
                head = l3;
            }else {
                ListNode listNode = new ListNode(rs);
                l3.next = listNode;
                l3 = listNode;
            }
            l3Real /= 10;
            countR++;

        }

        return head;
    }
    @Test
    public void test3(){
        int l3Real = 2000000;
        int rs = 0;
        int countR = 1;
        ListNode head = new ListNode(0);
        ListNode l3 = new ListNode(0);
        while (l3Real > 0) {

            rs = l3Real % 10;
            if (countR == 1){
                l3 = new ListNode(rs);
                head = l3;
            }else {
                ListNode listNode = new ListNode(rs);
                l3.next = listNode;
                l3 = listNode;
            }
            l3Real /= 10;
            countR++;

        }
        System.out.println(head);
    }
}
