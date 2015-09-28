package com.fbloginbutton2;

import android.widget.Button;

import com.facebook.login.widget.LoginButton;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIProp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by labr on 28/09/15.
 */
public class MyButtonManager extends SimpleViewManager<Button> {

    public static final String REACT_CLASS = "MyButton";

    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_WIDTH = "width";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected Button createViewInstance(ThemedReactContext themedReactContext) {
        return new Button(themedReactContext);
    }

    @Override
    public void updateView(Button root, CatalystStylesDiffMap props) {
        super.updateView(root, props);
        if(props.hasKey(PROP_WIDTH))
            root.setWidth(props.getInt(PROP_WIDTH, 100));
        root.setText("hello");
        root.setHeight(75);
    }
}
