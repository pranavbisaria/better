package com.Better.Payloads.NotificationFirebase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PushNotificationResponse {
    private int status;
    private String message;
}