(ns ^:figwheel-no-load proclodo-spa-server-rendering.dev
  (:require [proclodo-spa-server-rendering.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(enable-console-print!)

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3449/figwheel-ws"
  :jsload-callback core/mount-root)

(core/init!)
