
public class Test2 {
	// TODO �Զ����ɵĹ��캯�����  
	    public static void main(String agsp[]){  
	    	Student С��;
	    С�� = new Student("С��",18,"����");  
	    С��.show();  
	    	System.out.print("������������������������������������������������������������");  
	        System.out.println();  
	        Undergraduate С��;
	        С�� = new Undergraduate("С��",22,"��ѧ����","�������");  
	        С��.show();  
	        System.out.print("������������������������������������������������������������");  
	        System.out.println();  
	        Graduate С��;  
	        С�� = new Graduate("С��",25,"�о���","�Ƽ���");  
	        С��.show();  
	         
	    }  
	}  

class Student{     //����ѧ����Student 
	private String name;    //����  
	private int age;    //���� 
	private String education;   //ѧ�� 
	Student(String name, int age, String education) { //���췽��  
		this.name = name; 
		this.age = age; 
		this.education = education; 
		}
	
	public void show() {
		System.out.println("������"+name+"  "+"���䣺"+age+"  "+"ѧ����"+education); 
		}
	} 

class Undergraduate extends Student{   //��ѧ����������������   
	private String specialty;
	Undergraduate(String name, int age, String education,String spe) {
		super(name, age, education);
		this.specialty = spe;
		} 
	
	public void show() {
		super.show();
		System.out.println("רҵ��"+specialty);
		}
	}

class Graduate extends Student{   //��ѧ���������о��� ��
	private String direction;  
    Graduate(String name, int age, String education,String dir) {  
    super(name, age, education);  
    this.direction=dir;  
    }

    public void show() {   
         super.show();  
         System.out.println("�о�����"+direction);  
     }     
   }