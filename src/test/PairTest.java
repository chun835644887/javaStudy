package test;
import java.lang.reflect.Modifier;
import java.util.*;
import java.lang.*;
public class PairTest{
	public static void main(String[] args){
		String [] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("field1=" + mm.getField1());
        System.out.println("field2=" + mm.getField2());
	}
}