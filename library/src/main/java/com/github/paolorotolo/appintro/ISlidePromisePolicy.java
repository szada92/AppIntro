package com.github.paolorotolo.appintro;

import java.util.concurrent.Callable;

public interface ISlidePromisePolicy {

    /**
     * Whether the user has fulfilled the slides policy and should be allowed to navigate through the intro further.
     * If false is returned, {@link #onUserIllegallyRequestedNextPage()} will be called.
     *
     * @return True if the user should be allowed to leave the slide, else false.
     */
    Callable<Boolean> isPolicyRespected();

    /**
     * Called if a user tries to go to the next slide while into navigation has been locked.
     */
    void onUserIllegallyRequestedNextPage();
}
