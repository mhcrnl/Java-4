import java.util.Scanner;

public class Student {
	public static int numr = 1;
	private int age;
	private int num;
	private static Student[] allStudents;
	public Student(){
		age = (int)(Math.random()*7)+16;
		num = numr++;
	}

	public static int allA(int x,int y){
		if(allStudents[x].num > 1){
			System.out.printf("Student %d asking student %d.\n",x+1,x);
			int r = allStudents[x].getAge() + allA(x-1,y);
			if(x==y){
				System.out.printf("Student %d has total.\n",x+1);
			}else{
				System.out.printf("Student %d answers student %d\n",x+1,x+2);
			}
			return r;
		}else{
			System.out.printf("Student %d answers student %d\n",x+1,x+2);
			return allStudents[x].getAge();
		}
	}
	
	public static void main(String[] args) {
		Scanner usIn = new Scanner(System.in);
		System.out.println("Number of Students:");
		int x = usIn.nextInt();
		allStudents = new Student[x];
		
		for(int i = 0; i < allStudents.length;i++){
			allStudents[i] = new Student();
		}
		
		System.out.printf("Total Age: %d",allA(x-1,x-1));
		usIn.close();
	}
	
	public int getAge() {
		return age;
	}
}
