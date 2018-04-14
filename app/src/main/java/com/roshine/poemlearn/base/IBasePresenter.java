package com.roshine.poemlearn.base;


import io.reactivex.disposables.CompositeDisposable;

/**
 * @author Roshine
 * @date 2018/4/14 21:21
 * @blog http://www.roshine.xyz
 * @email roshines1016@gmail.com
 * @github https://github.com/Roben1016
 * @phone 136****1535
 * @desc presenter基类
 */
public abstract class IBasePresenter<V> {
    V view;
    protected CompositeDisposable compositeDisposable;
    public void onAttachView(V view){
        this.view = view;
        compositeDisposable = new CompositeDisposable();
    };

    public void onDestroyView(){
        compositeDisposable.clear();
        compositeDisposable = null;
        if (view != null) {
            view = null;
        }
    }
    public V getView() {
        return view;
    }
}
