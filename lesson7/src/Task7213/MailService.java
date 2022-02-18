package Task7213;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> map = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.get(key) == null ? new ArrayList<>() : super.get(key);
        }
    };

    @Override
    public void accept(Sendable<T> tSendable) {
        List<T> newList = map.getOrDefault(tSendable.getTo(), new ArrayList<>());
        newList.add(tSendable.getContent());
        map.put(tSendable.getTo(), newList);
    }

    public Map<String, List<T>> getMailBox() {
        return map;
    }

}
