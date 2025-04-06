public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int monthlySavings = 15000;
        int total = 0;
        int month = 0;
        for (; total <= 2_459_000; month++) {
            total += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        System.out.println(month);

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int y = 10;
        while (y >= 1) {
            System.out.print(y + " ");
            y--;
        }
        int cityzen = 12_000_000;
        int birth = 17;
        int death = 8;
        int yearCityzen = 0;
        int year = 0;
        while (year < 10) {
            year++;
            yearCityzen = cityzen / 1000 * (birth - death);
            cityzen = cityzen + yearCityzen;
            System.out.println();
            System.out.println("Год " + year + " численность населения составляет " + cityzen);

        }
        int deposit = 0;
        int monthDeposit = 0;
        while (deposit <= 12_000_000) {
            monthDeposit++;
            deposit = deposit + 15000;
            deposit = deposit + deposit * 7 / 100;
            if (monthDeposit % 6 == 0)
            {
                System.out.println("Месяц " + monthDeposit + " накоплено: " + deposit);
            }
        }
        int monthlyDeposit= 0;
        int oneMonth = 0;
        while (oneMonth <= 108) {
            oneMonth++;
            monthlyDeposit = monthlyDeposit + 15000;
            monthlyDeposit = monthlyDeposit + monthDeposit * 7 / 100;
            if (oneMonth % 6 == 0) {
                System.out.println("Месяц " + oneMonth + ", сумма накоплений равна " + monthlyDeposit + " рублей");
            }

        }
        int firstFriday = 7;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        int cometaYear = 0;
        while (cometaYear <2100) {
            cometaYear=cometaYear + 79;
            if ( 1800<=cometaYear){
                System.out.println(cometaYear);
            }
        }
    }
}