package com.java.revision;

import com.java.revision.linkedlist.LinkedList;

public class TestLinkedList {

    public static void testLinkedList() {
//        LinkedList linkedList = new LinkedList(5);
//        linkedList.append(10); //5,10
//        linkedList.append(2); //5,10,2
//        linkedList.prepend(18); //18,5,10,2
//        linkedList.prepend(7);  //7,18,5,10,2
//        linkedList.append(9); //7,18,5,10,2,9
//        linkedList.insert(2, 30); //7,18,30,5,10,2,9
//        linkedList.insert(30, 99); //7,18,30,5,10,2,9,99
//        linkedList.insert(-4, 999); //999,7,18,30,5,10,2,9,99
//        linkedList.remove(4); //999,7,18,30,10,2,9,99
//        linkedList.remove(-10); //7,18,30,10,2,9,99
//        linkedList.remove(9999); //7,18,30,10,2,9
//        linkedList.printList();
//        System.out.println("Size of linked list: " + linkedList.getLength());

        LinkedList linkedList = new LinkedList("abc");
        linkedList.append("def"); //abc,def
        linkedList.append("ghi"); //abc,def,ghi
        linkedList.prepend("jkl"); //jkl,abc,def,ghi
        linkedList.prepend("mno");  //mno,jkl,abc,def,ghi
        linkedList.append("pqr"); //mno,jkl,abc,def,ghi,pqr
        linkedList.insert(2, "stu"); //mno,jkl,stu,abc,def,ghi,pqr
        linkedList.insert(30, "vwx"); //mno,jkl,stu,abc,def,ghi,pqr,vwx
        linkedList.insert(-4, "yz"); //yz,mno,jkl,stu,abc,def,ghi,pqr,vwx
        linkedList.remove(4); //yz,mno,jkl,stu,def,ghi,pqr,vwx
        linkedList.remove(-10); //mno,jkl,stu,def,ghi,pqr,vwx
        linkedList.remove(9999); //mno,jkl,stu,def,ghi,pqr
        linkedList.reverse();
        linkedList.printList();
        System.out.println("Size of linked list: " + linkedList.getLength());
    }
}
