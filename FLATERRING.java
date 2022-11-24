package com.Java18.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FLATERRING {

	public static void main(String[] args) {
int[]a={7,17,27,37};
int[]b={3,13,23,33};
int[]c={9,19,29,39};
int[]d={6,16,26,36};
List <List<Integer>>l=Arrays.asList(Arrays.asList(7, 17, 27, 37),Arrays.asList(9, 19, 29, 39),Arrays.asList(3, 13, 23, 39),Arrays.asList(6, 16, 26, 36));
System.out.println(l);
List<Integer> k=l.stream().flatMap(s->s.stream()).collect(Collectors.toList());
/*Req_7869 starts with*/
int[]a={7,17,27,37};
int[]b={3,13,23,33};
int[]c={9,19,29,39};
int[]d={6,16,26,36};
List <List<Integer>>l=Arrays.asList(Arrays.asList(7, 17, 27, 37),Arrays.asList(9, 19, 29, 39),Arrays.asList(3, 13, 23, 39),Arrays.asList(6, 16, 26, 36));
/*Req_7869  Ends*/

System.out.println(l);
System.out.println(k);	


	}
}