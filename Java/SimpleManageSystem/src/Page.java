import java.util.Scanner;

// 页面交互界面信息
public class Page {
    /**
     * 启动页面，展示交互信息
     */
    Scanner sc = new Scanner(System.in);
    // 学生对象数组，存储学生信息，同时为了遍历方便存储数组的长度
    static Student[] students = new Student[10];
    static int counter = 0;

    // 设置一个临时学生数组，便于删除时需要存储学生信息
    static Student[] tempStudents = new Student[10];
    // 选项
    int option;

    static boolean isContinue = true;

    public void start(){
        while(isContinue){
            System.out.println("===========学生管理系统==========");
            System.out.print("1 添加学生信息\n2 修改学生信息\n3 删除学生信息\n4 查看学生信息\n5 退出系统\n");
            System.out.println("===============================");
            System.out.print("请选择管理选项(1-5):");
            option = sc.nextInt();

            switch(option){
                case 1:
                    // 添加学生信息
                    addStudent();
                    break;
                case 2:
                    // 修改学生信息
                    modifyStudent();
                    break;
                case 3:
                    // 删除学生信息
                    deleteStrudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    exit();
                    break;

            }

        }
    }

    // 显示所有学生信息
    private void displayStudents() {
        System.out.println("展示学生信息:");

        if(counter == 0){
            System.out.println("\t现有班级没有学生加入!");
            return;
        }

        System.out.println("学号\t姓名\t年龄\t性别");

        // 遍历学生信息
        Student student;
        for(int i = 0; i < counter; i++){
            student = students[i];
            System.out.println("" + student.getId() + "\t" + student.getName() +"\t"+student.getAge()+"\t"+student.getGender());
        }
    }

    private void deleteStrudent() {
        System.out.println("删除学生信息:");
        System.out.print("\t输入需要删除的学生学号: ");
        int id = sc.nextInt();

        Integer index = getIndex(id);
        // 使用系统方法 arraycopy 完成复制，分别进行两次复制，一次是复制到删除索引位置前的数据一次是复制删除索引位置之后的数据
        System.arraycopy(students, 0, tempStudents, 0, index);
        System.arraycopy(students, index + 1, tempStudents, index, students.length - index - 1);

        students = tempStudents;
        // 删除之后计数减一
        --counter;

    }

    private void modifyStudent() {
        System.out.println("修改学生信息:");

        System.out.print("\t输入需要修改的学生学号: ");
        int id = sc.nextInt();

        Integer index = getIndex(id);

        if (index != null) {
            System.out.print("\t请输入学生姓名: ");
            students[index].setName(sc.next());

            System.out.print("\t请输入学生年龄: ");
            students[index].setAge(sc.nextInt());

            System.out.print("\t请输入学生性别: ");
            students[index].setGender(sc.next());
        }
    }



    private void addStudent() {
        Student student = new Student();

        System.out.println("添加学生信息:");
        System.out.print("\t请输入学生学号: ");
        student.setId(sc.nextInt());

        System.out.print("\t请输入学生姓名: ");
        student.setName(sc.next());

        System.out.print("\t请输入学生年龄: ");
        student.setAge(sc.nextInt());

        System.out.print("\t请输入学生性别(F/M): ");
        student.setGender(sc.next());

        students[counter] = student;
        counter++;

    }

    // 退出系统方式
    public void exit(){
        System.out.print("确认需要退出系统(Y/n): ");
        String option = sc.next();
        if(option.toLowerCase().startsWith("y")){
            isContinue = false;
        }else if(option.toLowerCase().startsWith("n")){
            isContinue = true;
        }else{
            System.out.println("输入无效数据值" + option);
            isContinue = true;
        }
    }

    private static Integer getIndex(int id) {
        Integer index = null;
        for(int i = 0; i < counter; i++){
            if(students[i].getId() == id){
                index = i;
                break;
            }
        }

        if (index == null) {
            System.out.println("未找到学号为 <" + id +"> 学生");
        }
        return index;
    }
}
