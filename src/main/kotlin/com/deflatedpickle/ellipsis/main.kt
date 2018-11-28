package com.deflatedpickle.ellipsis

import com.deflatedpickle.ellipsis.widgets.TextBox
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell

fun main(args: Array<String>) {
    val display = Display()
    val shell = Shell(display)
    shell.text = "Ellipsis"
    shell.setMinimumSize(400, 400)
    shell.layout = GridLayout()

    val text = TextBox(shell)
    val layoutData = GridData(SWT.FILL, SWT.FILL)
    text.layoutData = layoutData

    shell.pack()
    shell.open()

    while (!shell.isDisposed) {
        if (!display.readAndDispatch()) {
            display.sleep()
        }
    }
    display.dispose()
}