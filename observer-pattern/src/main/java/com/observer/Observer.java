package com.observer;

import com.message.Email;
import com.message.Message;

/**
 * Created by guramritpal on 1/13/16.
 */
public interface Observer {
     void update(String message);

}
