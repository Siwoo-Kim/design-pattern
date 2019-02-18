package com.siwoo.designpattern.prac.decorator;

public abstract class Decorator extends Component {

    public abstract void setTarget(Component c);
    public abstract String getName();

}
