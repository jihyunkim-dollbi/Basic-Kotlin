/*
 	2020 06 08 KOTLIN
 	
 	��Ʋ������ ����ϴ� ��������
 	1)������(�빮��)
 		������
 			Byte  1byte => 8bit
 			Short 2byte => 16bit
 			Int   4byte => 32bit
 			Long  8byte => 64bit
 			
 		�Ǽ���
 			Bouble (64bit)
 			Float (32bit)
 
 	2)������
 		����
 			Char : '' 
 		���ڿ�
 			String: " "
 
 	3)����
 		Boolean : true/false
 
 	��������
 	1)���
 		val
 	2)����
 		var
 	ex) int a=10;
  		===============
 		var a=10;
 		var a:Int=10
 		
 		final int a=10;
 		===============
 		val b=20
 		val b:Int=20
 		
 		var b=false
 		var a=10.5
 		��Ʋ�� => FRONT��ü => JS�� ���!(var, val => �ڵ� ��ȯ ����!)
 		
 		##### �迭 //json�迭�κ��� ���̱⶧���� => �迭��븹��..
 		String[] names={"","",""};
 		==> val numbers:Array<Int>=arrayOf(1,2,3,4,5)
 			numbers[0].
 
 	������
 		���������(+ , * , - , / , %)
 		��������(&&, ||)
 		���Կ�����( = )
 		�񱳿�����( ==, !=, < , > , <=, >=)
 
 	���
 		
 	�Լ�
 	Ŭ����
 	�������̽�
 		
 		
 */
// ���� �Լ�
// public static void main...  
fun main(args:Array<String>)
{
	val a:Int=100
	val b:Int
	b=200
	var c=300
	
	//println(),print()
	//���ڿ� ������ �ȵ�
	println("a=$a,b=$b,c=$c")
	//a=100,b=200,c=300
	
	var s:String="Hello Kotlin"
	var cc='A'
	var d=10.5
	var bb=true
	var f:Float=10.5f
	println("cc=$cc,s=$s,d=$d,bb=$bb,f=$f")
	//cc=A,s=Hello Kotlin,d=10.5,bb=true,f=10.5
	
	
}
























