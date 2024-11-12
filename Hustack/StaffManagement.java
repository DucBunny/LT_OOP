import java.io.*;

public class StaffManagement {
    public static void main(String[] args) {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            int count = Integer.parseInt(br.readLine()); // Số nhân viên
            int maxSalary = Integer.parseInt(br.readLine()); // Lương cao nhất
            int salary = Integer.parseInt(br.readLine()); // Lương cơ bản
            int startCoef = Integer.parseInt(br.readLine()); // Hệ số lương bắt đầu
            int increaseCoef = Integer.parseInt(br.readLine()); // Hệ số tăng lương
            String name[] = new String[count]; // Tên nhân viên
            String yearOld[] = new String[count]; // Năm sinh
            int yearWork[] = new int[count]; // Số năm công tác
            int salaries[] = new int[count]; // Lương hiện tại
            int sumSalary = 0; // Tổng lương

            for (int i = 0; i < count; i++) {
                name[i] = br.readLine();
                yearOld[i] = br.readLine();
                yearWork[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < count; i++) {
                if (yearWork[i] > 5)
                    salaries[i] = salary * (startCoef + increaseCoef * ((yearWork[i] - 1) / 5));
                else
                    salaries[i] = salary * startCoef;

                if (salaries[i] > maxSalary)
                    salaries[i] = maxSalary;

                sumSalary += salaries[i];
            }

            for (int i = 0; i < count; i++) {
                System.out.print(name[i] + " " + yearOld[i] + " " + yearWork[i] + " " + salaries[i] + " ");
            }
            System.out.print(sumSalary);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
