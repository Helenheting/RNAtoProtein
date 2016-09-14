import java.io.*;

public class TranslatingRNAintoProtein{
public static void main (String args[])throws IOException{

FileReader f= new FileReader("/home/administrator/下载/prot.txt");
BufferedReader br = new BufferedReader(f);

String str =br.readLine();
String [] arr= str.split("(?<=\\G.{3})");

for(int i=0; i<arr.length;i++){
	
	String str1="UUU";
	String str2="UUC";
	if(str1.equals(arr[i])||str2.equals(arr[i])){
	System.out.print("F");}

	String str3="UUA";
	String str4="UUG";
	String str5="CUU";
	String str6="CUC";
	String str7="CUA";
	String str8="CUG";
        if(str3.equals(arr[i])||str4.equals(arr[i])||str5.equals(arr[i])||str6.equals(arr[i])||str7.equals(arr[i])||str8.equals(arr[i])){
	System.out.print("L");}

        String str9="UCU";
        String str10="UCC";
	String str11="UCA";
	String str12="UCG";
	String str13="AGU";
	String str14="AGC";
        if(str9.equals(arr[i])||str10.equals(arr[i])||str11.equals(arr[i])||str12.equals(arr[i])||str13.equals(arr[i])||str14.equals(arr[i])){
	System.out.print("S");}

        String str15="UAU";
        String str16="UAC";
        if(str15.equals(arr[i])||str16.equals(arr[i])){
        System.out.print("Y");}

        String str17="UAA";
        String str18="UAG";
	String str19="UGA";
        if(str17.equals(arr[i])||str18.equals(arr[i])||str19.equals(arr[i])){
        System.out.print("*************");}

	String str20="UGU";
        String str21="UGC";
        if(str20.equals(arr[i])||str21.equals(arr[i])){
        System.out.print("C");}

	String str22="UGG";
	if(str22.equals(arr[i])){
	System.out.print("W");}

        String str23="CCU";
        String str24="CCC";                                                  
        String str25="CCA";
	String str26="CCG";
        if(str23.equals(arr[i])||str24.equals(arr[i])||str25.equals(arr[i])||str26.equals(arr[i])){
        System.out.print("P");}

        String str27="CAU";
        String str28="CAC";                                                  
        if(str27.equals(arr[i])||str28.equals(arr[i])){
        System.out.print("H");}

        String str63="CAA";
        String str64="CAG";                                                  
        if(str63.equals(arr[i])||str64.equals(arr[i])){
        System.out.print("Q");} 

	String str66="CGG";
	String str65="CGU";
        String str29="CGC";
        String str30="CGA";                                                  
        if(str66.equals(arr[i])||str65.equals(arr[i])||str29.equals(arr[i])||str30.equals(arr[i])){
        System.out.print("R");}

        String str31="AUU";
        String str32="AUC";
        String str33="AUA";
        if(str31.equals(arr[i])||str32.equals(arr[i])||str33.equals(arr[i])){
        System.out.print("I");}

	String str34="AUG";
	if(str34.equals(arr[i])){
	System.out.print("M");}

        String str35="ACU";
        String str36="ACC";                                                  
        String str37="ACA";
        String str38="ACG";
        if(str35.equals(arr[i])||str36.equals(arr[i])||str37.equals(arr[i])||str38.equals(arr[i])){
        System.out.print("T");}

        String str39="AAU";
        String str40="AAC";                                                  
        if(str39.equals(arr[i])||str40.equals(arr[i])){
        System.out.print("N");}

        String str41="AAA";
        String str42="AAG";                                                  
        if(str41.equals(arr[i])||str42.equals(arr[i])){
        System.out.print("K");}

        String str45="AGA";
        String str46="AGG";                                                  
        if(str45.equals(arr[i])||str46.equals(arr[i])){
        System.out.print("R");}

        String str47="GAU";
        String str48="GAC";                                                  
        if(str47.equals(arr[i])||str48.equals(arr[i])){
        System.out.print("D");}

        String str49="GAA";
        String str50="GAG";                                                  
        if(str49.equals(arr[i])||str50.equals(arr[i])){
        System.out.print("E");} 

        String str51="GUU";
        String str52="GUC";                                                  
        String str53="GUA";
        String str54="GUG";
        if(str51.equals(arr[i])||str52.equals(arr[i])||str53.equals(arr[i])||str54.equals(arr[i])){
        System.out.print("V");}

        String str55="GGU";
        String str56="GGC";                                                  
        String str57="GGA";
        String str58="GGG";
        if(str55.equals(arr[i])||str56.equals(arr[i])||str57.equals(arr[i])||str58.equals(arr[i])){
        System.out.print("G");}

        String str59="GCU";
        String str60="GCC";                                                  
        String str61="GCA";
        String str62="GCG";
        if(str59.equals(arr[i])||str60.equals(arr[i])||str61.equals(arr[i])||str62.equals(arr[i])){
        System.out.print("A");}

}
}
}
