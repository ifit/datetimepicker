package com.sleepbot.datetimepicker;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.TextView;

/**
 * Fake Button class, used so TextViews can announce themselves as Buttons, for accessibility.
 */
public class AccessibleTextView extends TextView {

    public AccessibleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}

