package com.win.subscriberlist.subscriber;

import javax.persistence.GenerationType;

public @interface GenerateValue {

    GenerationType strategy();

}
