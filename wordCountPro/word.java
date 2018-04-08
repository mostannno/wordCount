
/*

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;*/



public class word {
	public static void main(String[] args){
		
		WordInfo test=new WordInfo("apple");
		WordInfo test1=new WordInfo("123");
		WordInfo test2=new WordInfo("let's");
		WordInfo test3=new WordInfo("asd!~&*");
		WordInfo test4=new WordInfo("TaVlE");
		String s = "apple";
		String s1 = "left-right";
		String s2 = "let's";
		String s3 = "asd!~&*";
		String s4 = "TaVlE";
		System.out.println(test.toString());
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		System.out.println(test4.toString());
		System.out.println(test3.num);
		System.out.println(test1.equals(s));
		System.out.println(test1.equals(s1));
		System.out.println(test1.equals(test1));
		System.out.println(test1.equals(test2));
		System.out.println(test1.compareTo(test));
		System.out.println(test1.compareTo(test1));
		System.out.println(test1.compareTo(test2));
		System.out.println(test2.equals(s));
		System.out.println(test2.equals(s1));
		System.out.println(test2.equals(test1));
		System.out.println(test2.equals(test2));
		System.out.println(test2.compareTo(test));
		System.out.println(test2.compareTo(test1));
		System.out.println(test2.compareTo(test2));
	}
}

class WordInfo implements Comparable<WordInfo>{
	String word;
	int num;
	public WordInfo(String word) {
		this.word=word;
		num=1;
	}
	void count(){
		num++;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof WordInfo){
			if(word.equals(((WordInfo) o).word))
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(WordInfo o) {
		if(num<o.num)
			return 1;
		else if(num>o.num)
			return -1;
		else if(word.compareTo(o.word)<0)
			return -1;
		else return 1;
	}
	@Override
	public String toString(){
		return word+" "+num;
	}
}
