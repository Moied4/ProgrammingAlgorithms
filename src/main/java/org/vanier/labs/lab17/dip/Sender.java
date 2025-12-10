package org.vanier.labs.lab17.dip;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sender {
    Notifier notifier;
    public void notifyUser(String message) {
      notifier.send(message);
    }
}
