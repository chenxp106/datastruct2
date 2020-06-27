package cn.gdut.designpattern.factory.abstractfactory;

public interface Tyre {
    public void revolve();
}

class LuxueryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

