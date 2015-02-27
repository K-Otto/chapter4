package ac.za.cput.chapter4.lsp.Correction.Impl;

import ac.za.cput.chapter4.lsp.Correction.Animals;

/**
 * Created by student on 2015/02/26.
 */
public class AnimalsImpl implements Animals{
    private String name;
    private String type;
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setType(String sn) {
        this.type = sn;
    }
    public String getType() {
        return type;
    }
}
