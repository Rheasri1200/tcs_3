/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] p=new int[N];
		int ans=0;
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    p[i]=num;
		    String s=Integer.toString(p[i]);
		    String arr[]=new String[3];
		        int a=Integer.parseInt(String.valueOf(s.charAt(0)));
		        int b=Integer.parseInt(String.valueOf(s.charAt(1)));
		        int c=Integer.parseInt(String.valueOf(s.charAt(2)));
		        int maxi=Math.max(a,Math.max(b,c));
		        int mini=Math.min(a,Math.min(b,c));
		         ans=(maxi*11)+(mini*7);
		         System.out.println("ans"+ans);
		        String se=Integer.toString(ans);
		        System.out.println("string"+se);
		        if(se.length()>2){
		            
                String temp=se.substring(1,3);
                String g=temp.substring(0,1);
                if(g.equals("0"));{
                    int n = Integer.parseInt(temp);
                    String padded = String.format("%01d" ,n );
                    
                    System.out.println("val>3but 0"+padded);
                    int ii=Integer.parseInt(padded);
                    System.out.println(ii);
                }
                
                int n = Integer.parseInt(temp);
		            
		             
		             System.out.println("numis"+n);
		            
		        }
		       
		        
		        
		    }
		    System.out.println(ans);
		    
		}
	}

