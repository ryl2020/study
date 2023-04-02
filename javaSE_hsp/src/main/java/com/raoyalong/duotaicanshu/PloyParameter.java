package com.raoyalong.duotaicanshu;

/**
 * @author raoyalong
 * @create 2022 - 12 - 31 15:32
 */
public class PloyParameter {

    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);
        ployParameter.testWork(tom);
        ployParameter.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "的薪水是：" + e.getAnnual());
    }

    public void testWork(Employee e){
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager)e).manage();
        }else {
            System.out.println("不做处理");
        }
    }
}
