package com.fbloginbutton2;

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
public class FBLoginButtonManager extends SimpleViewManager<LoginButton> {

    public static final String REACT_CLASS = "RCTFBLoginButton";

    @UIProp(UIProp.Type.NUMBER)
    public static final String PROP_WIDTH = "width";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected LoginButton createViewInstance(ThemedReactContext themedReactContext) {
        return new LoginButton(themedReactContext);
    }

    @Override
    public void updateView(LoginButton root, CatalystStylesDiffMap props) {
        super.updateView(root, props);
        if(props.hasKey(PROP_WIDTH))
            root.setWidth(props.getInt(PROP_WIDTH, 100));
        List<String> permissions= new ArrayList<String>();
        permissions.add("user_friends");
        permissions.add("email");
        root.setReadPermissions(permissions);
        root.setHeight(75);
    }
}
