package ua.opnu;

public class TimeSpan {
    int hours;
    int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    void add(int hours, int minutes) {
        if(hours >= 0 && minutes >= 0 && minutes <= 59) {
            this.hours += hours;
            int totalMinutes = this.minutes + minutes;
            this.hours += totalMinutes / 60;
            this.minutes = totalMinutes % 60;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return getHours() + getMinutes()/60.0;
    }

    int getTotalMinutes() {
        return getHours()*60 + getMinutes();
    }

    void subtract(TimeSpan span) {
        int totalThis = this.hours * 60 + this.minutes;
        int totalOther = span.getHours() * 60 + span.getMinutes();
        if (totalOther > totalThis) {
            return;
        }
        int resultMinutes = this.minutes - span.getMinutes();
        int resultHours = this.hours - span.getHours();
        if (resultMinutes < 0) {
            resultMinutes += 60;
            resultHours -= 1;
        }
        this.hours = resultHours;
        this.minutes = resultMinutes;
    }

    public void scale(int factor) {
        if (factor <= 0) {
            return;
        }
        int totalMinutes = (this.hours * 60 + this.minutes) * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}
