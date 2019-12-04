package com.mxz.MediatorPattern.Mediator;

/**
 * Created by Administrator on 2019/9/18.
 */
public class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
