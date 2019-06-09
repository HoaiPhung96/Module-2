/*********************************************
 **   Version: V.1.0.0                      **
 **   Author:Pham Van Hoai Phung            **
 **   e-mail: hoaiphungcntt@gmail.com       **
 **   github: github.com/HoaiPhung96        **
 **   facebook: facebook.com/HoaiPhung1996  **
 **   Copyright (c) 090619 PVHP-CodeGym     **
 *********************************************/
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}