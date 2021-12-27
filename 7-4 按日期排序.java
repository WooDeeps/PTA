import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MyData> datas = new ArrayList<>();
        while (input.hasNext()) {
            String temp = input.next();
            String[] temp_data = temp.split("/");
            datas.add(new MyData(temp_data));
            datas.sort(Comparator.naturalOrder());
        }
        for (MyData data : datas) {
            data.print();
        }
    }

    public static class MyData implements Comparable<MyData> {
        int year;
        int month;
        int day;

        public MyData(String[] data) {
            year = Integer.parseInt(data[2]);
            month = Integer.parseInt(data[0]);
            day = Integer.parseInt(data[1]);
        }

        @Override
        public int compareTo(MyData o) {
            if (this.year > o.year) {
                return 1;
            } else if (this.year < o.year) {
                return -1;
            } else if (this.month > o.month) {
                return 1;
            } else if (this.month < o.month) {
                return -1;
            } else if (this.day > o.day) {
                return 1;
            } else if (this.day < o.day) {
                return -1;
            } else {
                return 0;
            }
        }

        public void print() {
            System.out.printf("%02d/%02d/%04d\n", this.month, this.day, this.year);
        }
    }
}