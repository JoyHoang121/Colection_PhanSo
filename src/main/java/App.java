import entities.PhanSo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static entities.PhanSo.parseFromString;

public class App {
    public static ArrayList<PhanSo> ps = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Please select option below:");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        try {
            do {
                System.out.println();
                System.out.println("1. Input element");
                System.out.println("2. Print element");
                System.out.println("3. Add Element");
                System.out.println("4. Delete Element");
                System.out.println("5. Update Element");
                System.out.println("6. Find element which has largest value");
                System.out.println("7. Exit");
                System.out.println();

                int command = sc.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Số lượng phân số cần nhập:");
                        try {
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nhập vào phân số thứ: " + (i + 1));
                                String str = sc1.nextLine();
                                ps.add(i, PhanSo.parseFromString(str));
                            }
                            System.out.println(ps);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid format input");
                        }
                        break;
                    case 2:
                        if (ps.size() == 0) {
                            System.out.println("Danh sách rỗng: ");
                        } else {
                            System.out.println("Danh sách các phân số: ");
                            for (int i = 0; i < ps.size(); i++) {
                                ps.get(i).print();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập số lượng phân số cần thêm: ");
                        try {
                            int e = sc.nextInt();
                            for (int i = 0; i < e; i++) {
                                System.out.println("Nhập vào phân số thứ: " + (i + 1));
                                String str = sc1.nextLine();
                                ps.add(i, PhanSo.parseFromString(str));
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid format input");
                        }
                        break;
                    case 4:
                        if (ps.size() == 0) {
                            System.out.println("Danh sách rỗng, không thể chọn chức năng này ");
                        } else {
                            System.out.println("Mời nhập vị trí phân số cần xóa");
                            try {
                                int index = sc.nextInt();
                                if (index >= ps.size())
                                    System.out.println("Vị trí không tồn tại");
                                for (int i = 0; i < ps.size(); i++) {
                                    if (i == index) {
                                        ps.remove(i);
                                    }
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid format input");
                            }
                        }
                        break;
                    case 5:
                        if (ps.size() == 0) {
                            System.out.println("Danh sách rỗng, không thể chọn chức năng này ");
                        } else {
                            System.out.println("Mời nhập vị trí phân số cần thay đổi");
                            try {
                                int index1 = sc.nextInt();
                                if (index1 > ps.size())
                                    System.out.println("Vị trí không tồn tại");
                                for (int i = 0; i < ps.size(); i++) {
                                    if (i == index1) {
                                        System.out.println("Mời nhập phân số mới: ");
                                        String str = sc1.nextLine();
                                        ps.set(i, PhanSo.parseFromString(str));
                                        System.out.println(ps);
                                    }
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid format input");
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Chưa làm");
                        break;
                    default:
                        return;
                }
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Invalid format input");
        }
    }


//    public static void nhapPhanSo() {
//
//        System.out.println("Số lượng phân số cần nhập:");
//        int n = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < n; i++) {
//            try {
//                System.out.print("Mời nhập ps thứ: " + (i + 1) + " ");
//                String strPs1 = sc.nextLine();
//                ps.add(i, parseFromString(strPs1));
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid format");
//            }
//        }
//    }
//
//    public static void deleteElement() {
//        System.out.println("Mời nhập vị trí cần xóa");
//        int n = sc.nextInt();
//        ps.remove(n);
//    }

}

