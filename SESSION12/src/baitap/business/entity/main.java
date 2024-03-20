package baitap.business.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main
{
    private static List<Employee> employees =new ArrayList<>();

    public static void main(String[] args)
    { //1. Sap xep damh sach nhan vien theo tawng dan,
        sort();


    }
    public static void sort()
    {
        for (int i = 0; i <employees.size(); i++)
        {
            for (int j = i+1; j <employees.size() ; j++)
            {
                if (employees.get(i).getEmployeeName().compareTo(employees.get(i).getEmployeeName())>0)
                {
                    Employee temp = employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j,temp);

                }
            }
        }
    }
}
