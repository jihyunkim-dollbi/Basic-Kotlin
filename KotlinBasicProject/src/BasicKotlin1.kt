/*
 	2020 06 08 KOTLIN
 	
 	코틀린에서 사용하는 데이터형
 	1)숫자형(대문자)
 		정수형
 			Byte  1byte => 8bit
 			Short 2byte => 16bit
 			Int   4byte => 32bit
 			Long  8byte => 64bit
 			
 		실수형
 			Bouble (64bit)
 			Float (32bit)
 
 	2)문자형
 		문자
 			Char : '' 
 		문자열
 			String: " "
 
 	3)논리형
 		Boolean : true/false
 
 	변수설정
 	1)상수
 		val
 	2)변수
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
 		코틀린 => FRONT업체 => JS와 비슷!(var, val => 자동 변환 변수!)
 		
 		##### 배열 //json배열로보낼 것이기때문에 => 배열사용많음..
 		String[] names={"","",""};
 		==> val numbers:Array<Int>=arrayOf(1,2,3,4,5)
 			numbers[0].
 
 	연산자
 		산술연산자(+ , * , - , / , %)
 		논리연산자(&&, ||)
 		대입연산자( = )
 		비교연산자( ==, !=, < , > , <=, >=)
 
 	제어문
 		
 	함수
 	클래스
 	인터페이스
 		
 		
 */
// 메인 함수
// public static void main...  
fun main(args:Array<String>)
{
	val a:Int=100
	val b:Int
	b=200
	var c=300
	
	//println(),print()
	//문자열 결함이 안됨
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
























