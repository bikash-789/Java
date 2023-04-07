//Write a Program to find the total sales of last 3 years month sales of four different products of a company using multidimensional array
public class Q2 {
    public static void main(String args[])
    {
        findTotalSales();
    }

    public static void findTotalSales()
    {
        int[][][] sales = {
                {   // Year 1
                        {100, 200, 300, 400},   // Jan
                        {200, 300, 400, 500},   // Feb
                        {150, 250, 350, 450},   // Mar
                        {250, 350, 450, 550},   // Apr
                        {300, 400, 500, 600},   // May
                        {400, 500, 600, 700},   // Jun
                        {500, 600, 700, 800},   // Jul
                        {600, 700, 800, 900},   // Aug
                        {700, 800, 900, 1000},  // Sep
                        {800, 900, 1000, 1100}, // Oct
                        {900, 1000, 1100, 1200},// Nov
                        {1000, 1100, 1200, 1300}// Dec
                },
                {   // Year 2
                        {120, 220, 320, 420},
                        {220, 320, 420, 520},
                        {170, 270, 370, 470},
                        {270, 370, 470, 570},
                        {320, 420, 520, 620},
                        {420, 520, 620, 720},
                        {520, 620, 720, 820},
                        {620, 720, 820, 920},
                        {720, 820, 920, 1020},
                        {820, 920, 1020, 1120},
                        {920, 1020, 1120, 1220},
                        {1020, 1120, 1220, 1320}
                },
                {   // Year 3
                        {150, 250, 350, 450},
                        {250, 350, 450, 550},
                        {200, 300, 400, 500},
                        {300, 400, 500, 600},
                        {350, 450, 550, 650},
                        {450, 550, 650, 750},
                        {550, 650, 750, 850},
                        {650, 750, 850, 950},
                        {750, 850, 950, 1050},
                        {850, 950, 1050, 1150},
                        {950, 1050, 1150, 1250},
                        {1050, 1150, 1250, 1350}
                }
        };

        // Find the total sales
        int totalSales = 0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<12; j++)
            {
                for(int k=0; k<4; k++)
                {
                    totalSales += sales[i][j][k];
                }
            }
        }
        System.out.println("Total sales: "+totalSales);
    }
}
