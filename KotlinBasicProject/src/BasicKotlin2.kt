/*
	��Ʋ�� Ư��
 	1) ���� Ÿ�� ���� ��� : var a=10.5 => ������ ��� ���� ���� ���������� ������
 	2) ����: ���Ἲ, �ǿ뼺, ������ => ���(�ڹ�JVM)
 	3) ��ȣ��� : �ڹ� lib ��� ����(has JRE LIB)

 
*/
//import java.util.*;
// if, when(switch), for, while
/*
 	if���ǹ�
 	=if����
 	=if���� ~else
	=if����~else if~ else
 
 */
/*
 	when 
 
 */
fun main(args: Array<String>) {
	
	/*var a=10
	var b=20
	var c=max(a,b)
	println("max=$c")
	//max=20
	
	var d=30
	var e=50
	var k=max1(d,e)
	println("max1=$k")
	//max1=50
*/
	var score=85
	var grade=hakjum(score)
	println("score=$score, grade=$grade ����")
}

/*
 	fun �Լ���(�Ű�����...) = void �Լ��� �Ű�����
 	fun �Լ���(�Ű�����...):��������(������������)
 */
fun max(a:Int, b:Int):Int //:Int => Int return , no adding var
{
	var c:Int
	if(a>b)
		c=a
	else
		c=b
	return c
}

//{} ���� �Լ������ ���� => �Լ��� ������ ���� ���ҷ� ����Ѵ�.
fun max1(a:Int, b:Int):Int=if(a>b) a else b
fun max2(a:Int, b:Int)=if(a>b) a else b


fun hakjum(a:Int):Char
{
	var c:Char='A' //�ʱⰪ
	
	if(a>90)
		c='A'
	else if(a>80)
		c='B'
	else if(a>70)
		c='C'
	else if(a>60)
		c='D'
	else
		c='F'
	
	return c
}













