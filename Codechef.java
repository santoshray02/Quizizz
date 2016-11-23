/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s[]=new String[n];
		
		for(int i=0;i<n;i++){
		    s[i]=br.readLine();    
		}
		
		for(int i=0;i<n;i++){
		    int count=0;
		    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		    for(int j=0;j<s[i].length();j++){
		        count=hm.containsKey(s[i].charAt(j)) ? hm.get(s[i].charAt(j)) : 0;
		        hm.put(s[i].charAt(j),++count);
		        
		        
		    }
		    TreeMap<Character, Integer> sorted = new TreeMap<>(hm);
		        Set<Entry<Character, Integer>> entries = sorted.entrySet();
		    for(Entry<Character, Integer> entry : entries)
		    {   
		        if(entry.getValue()==count){
		         System.out.println("String "+(i+1)+" "+s[i]+" has most frequent alphabet :"+entry.getKey()+" count : "+count );
		        }
		    }


		   
		}
	}
}
