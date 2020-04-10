package CaseStudy.Data;

import CaseStudy.Models.Villa;

import java.util.Comparator;

public class NameServiceComparator implements Comparator<Villa> {
    @Override
    public int compare(Villa villa, Villa t1) {
            // sort student's name by ASC
            return villa.getNameServices().compareTo(villa.getNameServices());
        }
}
