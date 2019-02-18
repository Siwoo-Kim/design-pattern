package com.siwoo.designpattern.prac.decorator;

public class CommentDecorator extends Decorator {
    private Component target;

    public CommentDecorator(Component target) {
        setTarget(target);
    }

    @Override
    public void setTarget(Component target) {
        this.target = target;
    }

    @Override
    public String getName() {
        return "<!--" + target.getName() + "-->";
    }
}
