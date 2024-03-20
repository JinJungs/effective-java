package me.whiteship.chapter01.item08.cleaner;

import java.util.List;

public class BigObject {
    private List<Object> resource;

    public BigObject(List<Object> resource) {
        this.resource = resource;
    }

    // 1. static으로 만들어야 하고
    // 2. 메서드 내부에 자신(BigObject) 에 대한 레퍼런스가 있으면 안된다. -
    public static class ResourceCleaner implements Runnable {
        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("clean up.");
        }
    }
}
