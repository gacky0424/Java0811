package com.pcschool.ocp.d09.case7;

public interface Calc<T> {
    void add(T t);
}
/*以往的設計
public interface Calc1 {
    void add(String T);
}

public interface Calc2 {
    void add(int t);
}

public interface Calc3 {
    void add(double t);
}

public interface Calc4 {
    void add(char t);
}
*/
