package org.apache.tapestry5.integration.app1

import org.testng.annotations.Test


class AjaxGroovyTests extends App1TestCase {

    /** TAP5-2231 */
    @Test
    void radio_buttons_in_ajax_form() {

        openLinks "Ajax Radio Demo"

        click "css=label:contains('It')"
        click "css=label:contains('Temp')"

        click SUBMIT

        waitForElementToAppear "selected-department"

        assertText "selected-department", "IT"
        assertText "selected-position", "TEMP"

    }
}