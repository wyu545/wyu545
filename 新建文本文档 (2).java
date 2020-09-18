public class Test03 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入员工个数：");
		int number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("请输入员工姓名：");
			String name = scan.next();
			System.out.println("请输入员工年龄：");
			int age = scan.nextInt();
			System.out.println("请输入员工性别：");
			String gender = scan.next();
			System.out.println("请输入员工薪资：");
			int salary = scan.nextInt();
			Emp emp = new Emp(name,age,gender,salary);
			
			FileOutputStream fos = new FileOutputStream(name+".obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println(emp);
			System.out.println(name + "写出完毕！！！");
			oos.close();
		}
		scan.close();
	}