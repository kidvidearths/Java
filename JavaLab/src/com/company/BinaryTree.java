package com.company;

public class BinaryTree
{
    static void choose(int k)
    {
        if(k==1)
        {
            NormalBinary pain=new NormalBinary(15);
            pain.buildTree();
            pain.printTree();
        }
        else
        {
            DynamicTree pain=new DynamicTree(15);
            pain.buildTree();
            pain.printTree();
        }
    }
}

interface Tree
{
    void buildTree();
    void printTree();
}


class NormalBinary implements Tree
{
    int n;
    String[] tree;
    String left="0";
    String right="1";
    NormalBinary(int k)
    {
        n=k;
        tree=new String[n];
    }
    public void buildTree()
    {
        int number=0,rotor=0;
        while(number<n)
        {
            if(number==0)
            {
                tree[0]="0";
                tree[2*rotor+1]=tree[rotor]+left;
                tree[2*rotor+2]=tree[rotor]+right;
                number=number+3;
                rotor++;
            }
            else
            {
                tree[2*rotor+1]=tree[rotor]+left;
                number++;
                if(number>=n)
                    break;
                tree[2*rotor+2]=tree[rotor]+right;
                number++;
                rotor++;
            }
        }
    }
    public void printTree()
    {
        for(String s: tree)
            System.out.println(s);
    }
}

class Node
{
    String data;
    Node left;
    Node right;
}

class DynamicTree implements Tree
{
    int n;
    Node[] tree;
    String left="0";
    String right="1";
    DynamicTree(int k)
    {
        n=k;
        tree=new Node[n];
    }
    public void buildTree()
    {
        int number=1,rotor=0;
        Node temp=new Node();
        temp.data="0";
        tree[0]=temp;
        while(number<n)
        {
            if(tree[rotor].left==null)
            {
                temp=new Node();
                temp.data=tree[rotor].data+left;
                tree[rotor].left=temp;
                tree[number++]=temp;
                if(number>=n)
                    break;
            }
            else if(tree[rotor].right==null)
            {
                temp=new Node();
                temp.data=tree[rotor].data+right;
                tree[rotor].right=temp;
                tree[number++]=temp;
                rotor++;
            }
        }
    }
    public void printTree()
    {
        for(Node s: tree)
            System.out.println(s.data);
    }
}