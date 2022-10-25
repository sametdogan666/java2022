package core.logging.concretes;

import core.logging.abstracts.Logger;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi: " + data);
    }
}
