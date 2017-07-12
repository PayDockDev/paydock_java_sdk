
package com.paydock.paydocksdk.Models;

import com.paydock.paydocksdk.Models.NotificationEvent;

public class NotificationTemplateUpdateRequest   
{
    public String _id;
    public String body;
    public String label;
    public NotificationEvent notification_event = NotificationEvent.transaction_success;
    public boolean html;
}

