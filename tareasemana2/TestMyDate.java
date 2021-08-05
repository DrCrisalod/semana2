// Ejercicio 4 Please define MyDate class according to the following code, 
// and override the equals method in MyDate class, so that it can judge that when two 
// MyDate objects have the same year, month and day, the result is true, otherwise false, public boolean equals (Object o)

public class TestMyDate{

      public static void main(String[] args) {
            MyDate m1 = new MyDate(2,8,2019);
            MyDate m2 = new MyDate(2,8,2019);

MyDate m3 = null;

            if(m1==m2) {
                  System.out.println("m1==m2");
            }else {

                  System.out.println("m1!=m2");
            }

            if(m1.equals(m2)) {
                  System.out.println("m1 is equal to m2");

            }else {
                  System.out.println("m1 is not equal to m2");

            }

// Compare if m3 is equals to m1 or m2

// if(/* Write the missing condition */)
	if (m1.equals(m2))
	{
      System.out.println("m3 is equal to m1 or m2");

}else {
      System.out.println("m3 is not equal to m1 or m2");

}

      }
}

class MyDate{
      private int day;
      private int month;
      private int year;
      // Write the missing constructor here
        public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

      public int getDay() {
            return day;
      }
      public void setDay(int day) {
            this.day = day;
      }
      public int getMonth() {

            return month;
      }
      public void setMonth(int month) {

            this.month = month;
      }
      public int getYear() {

            return year;
      }
      public void setYear(int year) {
            this.year = year;

      }
      public boolean equals(Object obj) {

            // Write your code here
		if(this==obj) {
			return true;
		}else if(obj instanceof MyDate) {
			MyDate m=(MyDate)obj;
			return this.day==m.day && this.month==m.month && this.year==m.year;
		}else {
			return false;
		}

      }

}

// Respuestas 
/**
m1!=m2
m1 is equal to m2
m3 is equal to m1 or m2
*/
