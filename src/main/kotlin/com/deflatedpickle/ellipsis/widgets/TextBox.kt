package com.deflatedpickle.ellipsis.widgets

import org.eclipse.swt.SWT
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.events.KeyListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text

class TextBox(parent: Composite) : Composite(parent, SWT.NONE) {
    val text = Text(parent, SWT.BORDER or SWT.MULTI)

    init {
        val layoutData = GridData(SWT.FILL, SWT.FILL, true, true)
        text.layoutData = layoutData

        text.addKeyListener(object : KeyListener {
            override fun keyPressed(e: KeyEvent) {
            }

            override fun keyReleased(e: KeyEvent) {
                // if (e.stateMask and SWT.MOD1 == SWT.MOD1 && e.keyCode.toChar() == 'f')  {
                // }
            }
        })
    }
}